package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class n<V, O> implements m<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<com.airbnb.lottie.value.a<V>> f21592a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(V v3) {
        this(Collections.singletonList(new com.airbnb.lottie.value.a(v3)));
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<V>> b() {
        return this.f21592a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        if (this.f21592a.isEmpty()) {
            return true;
        }
        if (this.f21592a.size() == 1 && this.f21592a.get(0).h()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f21592a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f21592a.toArray()));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<com.airbnb.lottie.value.a<V>> list) {
        this.f21592a = list;
    }
}
