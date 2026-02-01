package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.N;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @I0.a
    @N
    public static final String f28536a = "next_page_token";

    /* renamed from: b, reason: collision with root package name */
    @I0.a
    @N
    public static final String f28537b = "prev_page_token";

    private h() {
    }

    @N
    public static <T, E extends j<T>> ArrayList<T> a(@N b<E> bVar) {
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList(bVar.getCount());
        try {
            Iterator<E> it = bVar.iterator();
            while (it.hasNext()) {
                listWithAutoConstructFlag.add(it.next().b());
            }
            return listWithAutoConstructFlag;
        } finally {
            bVar.close();
        }
    }

    public static boolean b(@N b<?> bVar) {
        if (bVar != null && bVar.getCount() > 0) {
            return true;
        }
        return false;
    }

    public static boolean c(@N b<?> bVar) {
        Bundle e4 = bVar.e();
        if (e4 != null && e4.getString(f28536a) != null) {
            return true;
        }
        return false;
    }

    public static boolean d(@N b<?> bVar) {
        Bundle e4 = bVar.e();
        if (e4 != null && e4.getString(f28537b) != null) {
            return true;
        }
        return false;
    }
}
