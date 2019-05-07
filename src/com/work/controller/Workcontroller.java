package com.work.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.work.model.Work;
import com.work.service.Workservice;


@Controller
public class Workcontroller {
	
	@Autowired
	Workservice service;
	
	@RequestMapping("/")
	public String dostart(Model themodel)
	{
		themodel.addAttribute("work",new Work());
		return "home";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute("work") Work w,Model themodel)
	{
		service.insert(w);
		List<Work> det=service.display();
		themodel.addAttribute("det",det);
		return "display";
	}
	
	@RequestMapping("/display")
	public String display(Model themodel)
	{
		List<Work> det=service.display();
		themodel.addAttribute("det",det);
		return "display";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") String id,Model themodel)
	{
		themodel.addAttribute("work",service.edit(id));
		return "home";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") String id,Model themodel,@ModelAttribute("work") Work w1)
	{
		service.delete(w1);
		List<Work> det=service.display();
		themodel.addAttribute("det",det);
		return "display";
	}

}
