package documentFactory;

import application.Main;
import software_masters.model.PlannerModel;
import software_masters.planner_networking.Node;

public class DocumentFactory
{
	Main application;
	PlannerModel model;
	
	public void setApplication(Main application)
	{
		this.application = application;
		model = this.application.getModel();
	}
	
	private void Transcribe()
	{
		Node plan = model.getCurrPlanFile().getPlan().getRoot().getChildren().get(1);
		System.out.println(plan.getName());
	}
}