package de.urr4.learning.camunda.beans;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.ProcessInstance;

public class PrintTheWordDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        ProcessInstance processInstance = (ProcessInstance) delegateExecution;
        System.out.println("Hello World");
    }
}
