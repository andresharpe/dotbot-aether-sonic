package com.harman.jbl.partybox.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final d f46171a = new d();

    private d() {
    }

    public final void a(@l3.d ActivityC0889g fragmentActivity, @l3.d Fragment baseFragment, int i4, int i5) {
        F.p(fragmentActivity, "fragmentActivity");
        F.p(baseFragment, "baseFragment");
        try {
            FragmentManager S3 = fragmentActivity.S();
            F.o(S3, "getSupportFragmentManager(...)");
            String name = baseFragment.getClass().getName();
            androidx.fragment.app.F q4 = S3.q();
            F.o(q4, "beginTransaction(...)");
            Fragment o02 = S3.o0(name);
            if (!baseFragment.isAdded() && o02 == null) {
                S3.j0();
            }
            if (o02 != null) {
                androidx.fragment.app.F q5 = S3.q();
                F.o(q5, "beginTransaction(...)");
                q5.B(o02).r();
            }
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                q4.M(j.a.f40574m, j.a.f40575n);
                            }
                        } else {
                            int i6 = j.b.f40580e;
                            int i7 = j.b.f40581f;
                            q4.N(i6, i7, i6, i7);
                        }
                    } else {
                        q4.N(j.a.f40572k, j.a.f40573l, j.a.f40574m, j.a.f40575n);
                    }
                } else {
                    q4.N(j.a.f40574m, j.a.f40575n, j.a.f40572k, j.a.f40573l);
                }
            } else {
                q4.N(j.b.f40582g, j.b.f40583h, j.b.f40584i, j.b.f40585j);
            }
            q4.o(name);
            com.harman.log.f.a("AppUtils", "addStatus:" + baseFragment.isAdded());
            if (baseFragment.isAdded()) {
                androidx.fragment.app.F q6 = S3.q();
                F.o(q6, "beginTransaction(...)");
                q6.B(baseFragment).r();
            }
            q4.g(i5, baseFragment, name);
            q4.r();
            com.harman.log.f.a("AppUtils", "After commitAllowingStateLoss, isAdded: " + baseFragment.isAdded());
        } catch (Exception e4) {
            com.harman.log.f.b("AppUtils", "Exception:" + e4.getLocalizedMessage());
        }
    }

    @l3.e
    public final Bitmap b(@l3.e Activity activity) {
        Bitmap createBitmap;
        if (activity == null) {
            return null;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            F.o(decorView, "getDecorView(...)");
            decorView.setDrawingCacheEnabled(true);
            decorView.buildDrawingCache();
            Bitmap drawingCache = decorView.getDrawingCache();
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i4 = rect.top;
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i5 = point.x;
            int i6 = point.y;
            if (i6 + i4 <= drawingCache.getHeight()) {
                createBitmap = Bitmap.createBitmap(drawingCache, 0, i4, i5, i6);
                F.m(createBitmap);
            } else {
                createBitmap = Bitmap.createBitmap(drawingCache, 0, i4, i5, i6 - i4);
                F.m(createBitmap);
            }
            decorView.destroyDrawingCache();
            return f.a(activity, createBitmap);
        } catch (Exception unused) {
            return null;
        }
    }
}
