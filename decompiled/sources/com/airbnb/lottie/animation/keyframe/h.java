package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<com.airbnb.lottie.model.content.i, Path>> f21383a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f21384b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Mask> f21385c;

    public h(List<Mask> list) {
        this.f21385c = list;
        this.f21383a = new ArrayList(list.size());
        this.f21384b = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f21383a.add(list.get(i4).b().a());
            this.f21384b.add(list.get(i4).c().a());
        }
    }

    public List<a<com.airbnb.lottie.model.content.i, Path>> a() {
        return this.f21383a;
    }

    public List<Mask> b() {
        return this.f21385c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f21384b;
    }
}
