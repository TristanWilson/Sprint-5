package documentFactory;

import application.Main;
import software_masters.model.PlannerModel;
import software_masters.planner_networking.PlanFile;

public class DocumentFactory
{
	Main application;
	PlannerModel model;
	
	public DocumentFactory(Main application)
	{
		this.application = application;
		this.model = application.getModel();
	}
	
	private void Transcribe()
	{
		PlanFile plan = model.getCurrPlanFile();
		
		switch(plan.getPlan().getRoot().getChildren().get(1).getName())
		{
		case "Mission":
			//Do Centre
			break;
		}
	}
}