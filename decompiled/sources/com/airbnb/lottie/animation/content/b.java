package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<t> f21227a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(t tVar) {
        this.f21227a.add(tVar);
    }

    public void b(Path path) {
        for (int size = this.f21227a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.j.b(path, this.f21227a.get(size));
        }
    }
}
