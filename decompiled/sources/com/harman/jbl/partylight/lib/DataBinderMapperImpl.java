package com.harman.jbl.partylight.lib;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends k {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f46202a = new SparseIntArray(0);

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f46203a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f46203a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f46204a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<k> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i4) {
        return a.f46203a.get(i4);
    }

    @Override // androidx.databinding.k
    public ViewDataBinding c(l lVar, View view, int i4) {
        if (f46202a.get(i4) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.k
    public ViewDataBinding d(l lVar, View[] viewArr, int i4) {
        if (viewArr == null || viewArr.length == 0 || f46202a.get(i4) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f46204a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
