package de.urr4.learning.camunda.listeners;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class ReasonPrinter implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("The reason is "+delegateTask.getVariable("reason"));
    }
}
