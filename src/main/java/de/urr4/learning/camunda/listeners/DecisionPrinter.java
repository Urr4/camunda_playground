package de.urr4.learning.camunda.listeners;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class DecisionPrinter implements ExecutionListener {

    @Override
    public void notify(DelegateExecution delegateExecution) {
        System.out.println(delegateExecution.getVariable("words"));
    }

}
