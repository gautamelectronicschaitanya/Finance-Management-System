package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.RegisterDao;
import com.lti.model.User;
import com.lti.model.UserDTO;

@Controller
public class RegisterController {

	@Autowired
	private RegisterDao registerDao;
	
	/*
	 * no need to read the form data manually
	 * Spring can automatically populate a 
	 * bean object, i.e Spring can automatically
	 * store form data in the object
	 * of a POJO class
	 */
	@RequestMapping(path = "/register.lti", method = RequestMethod.POST)
	public String register(UserDTO userDTO) {
		
		//code for processing the uploaded file
		String path = "d:/uploads/";
		String filename = userDTO.getName() + "-" + userDTO.getProfilePic().getOriginalFilename(); 
		String finalpath = path + filename;
		try {
			userDTO.getProfilePic().transferTo(new File(finalpath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//instead of the code below, we can use libraries
		//like BeanUtils or ObjectMapper for automatically
		//copying data from object to another
		User user = new User();
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setAge(userDTO.getAge());
		user.setProfilePicFilename(filename);
		
		//now the code to store the data in the database
		registerDao.save(user);
				
		return "register.jsp";
	}

	@RequestMapping(path = "/searchUser.lti", method = RequestMethod.POST)
	public String search(@RequestParam("email") String email,
						HttpServletRequest request,
						Map<String, Object> model) {
		
		User user = registerDao.fetch(email);
		model.put("userData", user);
		
		//code to copy the upload profile pic of the 
		//user from d:/uploads to the current project's
		//uploads directory
		String projlocation = request.getServletContext().getRealPath("/");
		new File(projlocation + "/uploads").mkdir();
		File srcfile = new File("d:/uploads/"+user.getProfilePicFilename());
		File destfile = new File(projlocation + "/uploads/" + user.getProfilePicFilename());
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "searchResult.jsp";		
	}
}
