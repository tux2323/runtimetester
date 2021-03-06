package de.propix.runtimetester.core.runner.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.propix.runtimetester.core.runner.Tester;

public class Activator implements BundleActivator {
		
	private OsgiRuntimeTesterImpl service;
	
	public void start(BundleContext context) throws Exception {
		service = new OsgiRuntimeTesterImpl(context);
		context.registerService(Tester.class.getName(), service, null);
	}

	public void stop(BundleContext context) throws Exception {
		service = null;
	}

}
