package com.netease.componentlib.impl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.netease.componentlib.service.IloginService;

public class EmptyLoginService implements IloginService {
    @Override
    public void launch(Context context, String targetClass) {

    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int VuiewId, Bundle bundle) {
        return null;
    }
}
