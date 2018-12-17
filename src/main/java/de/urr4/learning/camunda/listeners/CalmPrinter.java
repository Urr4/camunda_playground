package de.urr4.learning.camunda.listeners;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class CalmPrinter implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("Calming: "+delegateTask.getVariable("niceWords"));
    }
}
