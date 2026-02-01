package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class E implements Iterable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ CharSequence f29129E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ G f29130F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(G g4, CharSequence charSequence) {
        this.f29130F = g4;
        this.f29129E = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator h4;
        h4 = this.f29130F.h(this.f29129E);
        return h4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(z.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(z.a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
