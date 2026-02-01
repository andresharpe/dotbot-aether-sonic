package com.google.android.gms.common.data;

import androidx.annotation.N;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k {
    @N
    public static <T, E extends j<T>> ArrayList<T> a(@N ArrayList<E> arrayList) {
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            listWithAutoConstructFlag.add(arrayList.get(i4).b());
        }
        return listWithAutoConstructFlag;
    }

    @N
    public static <T, E extends j<T>> ArrayList<T> b(@N E[] eArr) {
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e4 : eArr) {
            listWithAutoConstructFlag.add(e4.b());
        }
        return listWithAutoConstructFlag;
    }

    @N
    public static <T, E extends j<T>> ArrayList<T> c(@N Iterable<E> iterable) {
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            listWithAutoConstructFlag.add(it.next().b());
        }
        return listWithAutoConstructFlag;
    }
}
