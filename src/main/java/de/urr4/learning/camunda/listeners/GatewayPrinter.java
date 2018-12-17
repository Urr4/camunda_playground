package de.urr4.learning.camunda.listeners;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class GatewayPrinter implements ExecutionListener {


    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Gateway: ");
        for (String name : delegateExecution.getVariableNames()) {
            System.out.println(name + ":" + delegateExecution.getVariable(name));
        }
    }
}
