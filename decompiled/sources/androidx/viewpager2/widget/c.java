package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.N;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements ViewPager2.m {

    /* renamed from: a, reason: collision with root package name */
    private final List<ViewPager2.m> f20689a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@N View view, float f4) {
        Iterator<ViewPager2.m> it = this.f20689a.iterator();
        while (it.hasNext()) {
            it.next().a(view, f4);
        }
    }

    public void b(@N ViewPager2.m mVar) {
        this.f20689a.add(mVar);
    }

    public void c(@N ViewPager2.m mVar) {
        this.f20689a.remove(mVar);
    }
}
