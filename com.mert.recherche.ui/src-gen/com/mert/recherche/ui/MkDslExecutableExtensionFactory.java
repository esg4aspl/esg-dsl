/*
 * generated by Xtext 2.25.0
 */
package com.mert.recherche.ui;

import com.google.inject.Injector;
import com.mert.recherche.ui.internal.RechercheActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MkDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(RechercheActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		RechercheActivator activator = RechercheActivator.getInstance();
		return activator != null ? activator.getInjector(RechercheActivator.COM_MERT_RECHERCHE_MKDSL) : null;
	}

}