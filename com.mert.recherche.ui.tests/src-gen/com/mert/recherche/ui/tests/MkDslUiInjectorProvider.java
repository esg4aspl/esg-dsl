/*
 * generated by Xtext 2.25.0
 */
package com.mert.recherche.ui.tests;

import com.google.inject.Injector;
import com.mert.recherche.ui.internal.RechercheActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MkDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RechercheActivator.getInstance().getInjector("com.mert.recherche.MkDsl");
	}

}
