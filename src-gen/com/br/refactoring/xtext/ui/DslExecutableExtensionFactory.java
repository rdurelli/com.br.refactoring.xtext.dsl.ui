/*
 * generated by Xtext
 */
package com.br.refactoring.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return com.br.refactoring.xtext.ui.internal.DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return com.br.refactoring.xtext.ui.internal.DslActivator.getInstance().getInjector("com.br.refactoring.xtext.Dsl");
	}
	
}