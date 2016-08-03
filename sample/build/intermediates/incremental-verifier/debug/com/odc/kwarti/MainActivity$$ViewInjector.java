// Generated code from Butter Knife. Do not modify!
package com.odc.kwarti;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.odc.kwarti.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427451, "field 'toolbar'");
    target.toolbar = (android.support.v7.widget.Toolbar) view;
    view = finder.findRequiredView(source, 2131427453, "field 'tabs'");
    target.tabs = (com.odc.PagerSlidingTabStrip) view;
    view = finder.findRequiredView(source, 2131427454, "field 'pager'");
    target.pager = (android.support.v4.view.ViewPager) view;
  }

  public static void reset(com.odc.kwarti.MainActivity target) {
    target.toolbar = null;
    target.tabs = null;
    target.pager = null;
  }
}
