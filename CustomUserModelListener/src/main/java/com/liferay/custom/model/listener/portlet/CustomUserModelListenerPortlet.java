package com.liferay.custom.model.listener.portlet;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

import org.osgi.service.component.annotations.Component;

/**
 * @author mtpr405
 */
@Component(
		immediate = true,
		service = ModelListener.class
	)
public class CustomUserModelListenerPortlet extends BaseModelListener<User> {
	
	private static final Log log = LogFactoryUtil.getLog(CustomUserModelListenerPortlet.class);

	@Override
	public void onBeforeCreate(User userModel) throws ModelListenerException {
		log.info("in onBeforeCreate method");
		log.info("userModel : " + userModel);
		super.onBeforeCreate(userModel);
	}

	@Override
	public void onAfterCreate(User userModel) throws ModelListenerException {
		log.info("in onAfterCreate method");
		log.info("userModel : " + userModel);
		super.onAfterCreate(userModel);
	}
	
	
	
	
}