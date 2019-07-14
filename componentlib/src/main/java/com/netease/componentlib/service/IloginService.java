package com.netease.componentlib.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface IloginService {

    void launch(Context context,String targetClass);

    Fragment newUserInfoFragment(FragmentManager fragmentManager, int VuiewId, Bundle bundle);

}
