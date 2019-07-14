package com.netease.componentlib;

import com.netease.componentlib.impl.EmptyLoginService;
import com.netease.componentlib.impl.EmptyMineService;
import com.netease.componentlib.service.IMineService;
import com.netease.componentlib.service.IloginService;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){return instance;}

    private ServiceFactory(){}

    private IloginService mLoginService;
    private IMineService mMineService;

    public IloginService getLoginService() {
        if(mLoginService == null){
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

        public void setLoginService(IloginService loginService) {
            mLoginService = loginService;
        }

        public IMineService getMineService() {
            if(mMineService == null){
                mMineService = new EmptyMineService();
            }
            return mMineService;
    }

    public void setMineService(IMineService mineService) {
        mMineService = mineService;
    }

}
