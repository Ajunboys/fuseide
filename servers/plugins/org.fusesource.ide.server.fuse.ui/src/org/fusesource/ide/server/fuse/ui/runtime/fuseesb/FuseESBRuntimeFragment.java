/*******************************************************************************
 * Copyright (c) 2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.fusesource.ide.server.fuse.ui.runtime.fuseesb;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.server.core.IRuntime;
import org.fusesource.ide.server.fuse.ui.FuseSharedImages;
import org.fusesource.ide.server.fuse.ui.Messages;
import org.fusesource.ide.server.karaf.ui.runtime.v2x.KarafRuntimeFragment;

/**
 * @author lhein
 */
public class FuseESBRuntimeFragment extends KarafRuntimeFragment {

	/*
	 * (non-Javadoc)
	 * @see org.fusesource.ide.server.karaf.ui.runtime.v2x.KarafRuntimeFragment#updateWizardHandle(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void updateWizardHandle(Composite parent) {
		// make modifications to parent
		IRuntime r = getRuntimeFromTaskModel();
		handle.setTitle(Messages.FuseESBRuntimeComposite_wizard_tite);
		String descript = r.getRuntimeType().getDescription();
		handle.setDescription(descript);
		handle.setImageDescriptor(getImageDescriptor());
		initiateHelp(parent);
	}

	/*
	 * (non-Javadoc)
	 * @see org.fusesource.ide.server.karaf.ui.runtime.v2x.KarafRuntimeFragment#getExplanationText()
	 */
	@Override
	protected String getExplanationText() {
		return "Please point to a JBoss Fuse installation.";
	}

	/*
	 * (non-Javadoc)
	 * @see org.fusesource.ide.server.karaf.ui.runtime.v2x.KarafRuntimeFragment#getImageDescriptor()
	 */
	@Override
	protected ImageDescriptor getImageDescriptor() {
		String imageKey = FuseSharedImages.IMG_FUSE_LOGO_LARGE;
		return FuseSharedImages.getImageDescriptor(imageKey);
	}
}
