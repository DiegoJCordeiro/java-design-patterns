package br.com.diegocordeiro;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.chain.ExecutorChainOfResponsibility;
import br.com.diegocordeiro.patterns.behavior.command.ExecutorCommand;
import br.com.diegocordeiro.patterns.behavior.iterator.ExecutorIterator;
import br.com.diegocordeiro.patterns.behavior.mediator.ExecutorMediator;
import br.com.diegocordeiro.patterns.behavior.memento.ExecutorMemento;
import br.com.diegocordeiro.patterns.behavior.observer.ExecutorObserver;
import br.com.diegocordeiro.patterns.behavior.state.ExecutorState;
import br.com.diegocordeiro.patterns.behavior.strategy.ExecutorStrategy;
import br.com.diegocordeiro.patterns.behavior.template.ExecutorTemplateMethod;
import br.com.diegocordeiro.patterns.creational.abstractfactory.ExecutorAbstractFactory;
import br.com.diegocordeiro.patterns.creational.builder.ExecutorBuilder;
import br.com.diegocordeiro.patterns.creational.factorymethod.ExecutorFactoryMethod;
import br.com.diegocordeiro.patterns.creational.monostate.ExecutorMonoState;
import br.com.diegocordeiro.patterns.creational.prototype.ExecutorPrototype;
import br.com.diegocordeiro.patterns.creational.singleton.ExecutorSingleton;
import br.com.diegocordeiro.patterns.structural.adapter.ExecutorAdapter;
import br.com.diegocordeiro.patterns.structural.bridge.ExecutorBridge;
import br.com.diegocordeiro.patterns.structural.composite.ExecutorComposite;
import br.com.diegocordeiro.patterns.structural.decorator.ExecutorDecorator;
import br.com.diegocordeiro.patterns.structural.facade.ExecutorFacade;
import br.com.diegocordeiro.patterns.structural.flyweight.ExecutorFlyWeight;
import br.com.diegocordeiro.patterns.structural.proxy.ExecutorProxy;

public class Application
{
    public static void main( String[] args )
    {

        // Starting - Creation Patterns

        ExecutorPatterns executorFactoryMethod = new ExecutorFactoryMethod();
        executorFactoryMethod.execute();

        System.out.println("   ");

        ExecutorPatterns executorBuilder = new ExecutorBuilder();
        executorBuilder.execute();

        System.out.println("   ");

        ExecutorPatterns executorAbstractFactory = new ExecutorAbstractFactory();
        executorAbstractFactory.execute();

        System.out.println("   ");

        ExecutorPatterns executorSingleton = new ExecutorSingleton();
        executorSingleton.execute();

        System.out.println("   ");

        ExecutorPatterns executorMonoState = new ExecutorMonoState();
        executorMonoState.execute();

        // Ending - Creation Patterns

        // Starting - Structural Patterns

        System.out.println("   ");

        ExecutorPatterns executorPrototype = new ExecutorPrototype();
        executorPrototype.execute();

        System.out.println("   ");

        ExecutorPatterns executorAdapter = new ExecutorAdapter();
        executorAdapter.execute();

        System.out.println("   ");

        ExecutorPatterns executorBridge = new ExecutorBridge();
        executorBridge.execute();

        System.out.println("   ");

        ExecutorPatterns executorComposite = new ExecutorComposite();
        executorComposite.execute();

        System.out.println("   ");

        ExecutorPatterns executorDecorator = new ExecutorDecorator();
        executorDecorator.execute();

        System.out.println("   ");

        ExecutorPatterns executorFacade = new ExecutorFacade();
        executorFacade.execute();

        System.out.println("   ");

        ExecutorPatterns executorFlyWeight = new ExecutorFlyWeight();
        executorFlyWeight.execute();

        System.out.println("   ");

        ExecutorPatterns executorProxy = new ExecutorProxy();
        executorProxy.execute();

        // Ending - Structural Patterns

        // Starting - Behavior Patterns

        System.out.println("   ");

        ExecutorPatterns executorChainOfResponsibility = new ExecutorChainOfResponsibility();
        executorChainOfResponsibility.execute();

        System.out.println("   ");

        ExecutorPatterns executorMemento = new ExecutorMemento();
        executorMemento.execute();

        System.out.println("   ");

        ExecutorPatterns executorCommand = new ExecutorCommand();
        executorCommand.execute();

        System.out.println("   ");

        ExecutorPatterns executorMediator = new ExecutorMediator();
        executorMediator.execute();

        System.out.println("   ");

        ExecutorPatterns executorObserver = new ExecutorObserver();
        executorObserver.execute();

        System.out.println("   ");

        ExecutorPatterns executorStrategy = new ExecutorStrategy();
        executorStrategy.execute();

        System.out.println("   ");

        ExecutorPatterns executorState = new ExecutorState();
        executorState.execute();

        System.out.println("   ");

        ExecutorPatterns executorIterator = new ExecutorIterator();
        executorIterator.execute();

        System.out.println("   ");

        ExecutorPatterns executorTemplateMethod = new ExecutorTemplateMethod();
        executorTemplateMethod.execute();

        // Ending - Behavior Patterns
    }
}
