package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/job_titles")
public class JobTitleController 
{
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitleController(JobTitleService jobTitleService)
	{
		this.jobTitleService=jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll()
	{
		return this.jobTitleService.getAll();
	}
	
}
