package org.junit.runner.manipulation;

import java.util.Comparator;
import org.junit.runner.Description;
import org.junit.runner.manipulation.f;

/* loaded from: classes2.dex */
public final class a extends h implements f.c {

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<Description> f55745d = new C0531a();

    /* renamed from: org.junit.runner.manipulation.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0531a implements Comparator<Description> {
        C0531a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Description description, Description description2) {
            return description.p().compareTo(description2.p());
        }
    }

    public a() {
        super(f55745d);
    }

    @Override // org.junit.runner.manipulation.f.c
    public f a(f.b bVar) {
        return this;
    }
}
