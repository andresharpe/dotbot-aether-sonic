package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.e0;
import androidx.collection.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f31220c = "MotionSpec";

    /* renamed from: a, reason: collision with root package name */
    private final l<String, i> f31221a = new l<>();

    /* renamed from: b, reason: collision with root package name */
    private final l<String, PropertyValuesHolder[]> f31222b = new l<>();

    private static void a(@N h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.m(objectAnimator.getPropertyName(), i.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @N
    private PropertyValuesHolder[] b(@N PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i4 = 0; i4 < propertyValuesHolderArr.length; i4++) {
            propertyValuesHolderArr2[i4] = propertyValuesHolderArr[i4].clone();
        }
        return propertyValuesHolderArr2;
    }

    @P
    public static h c(@N Context context, @N TypedArray typedArray, @e0 int i4) {
        int resourceId;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            return d(context, resourceId);
        }
        return null;
    }

    @P
    public static h d(@N Context context, @InterfaceC0559b int i4) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return e(arrayList);
        } catch (Exception e4) {
            Log.w(f31220c, "Can't load animation resource ID #0x" + Integer.toHexString(i4), e4);
            return null;
        }
    }

    @N
    private static h e(@N List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a(hVar, list.get(i4));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f31221a.equals(((h) obj).f31221a);
    }

    @N
    public <T> ObjectAnimator f(@N String str, @N T t3, @N Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t3, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @N
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f31222b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i h(String str) {
        if (k(str)) {
            return this.f31221a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f31221a.hashCode();
    }

    public long i() {
        int size = this.f31221a.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i q4 = this.f31221a.q(i4);
            j4 = Math.max(j4, q4.c() + q4.d());
        }
        return j4;
    }

    public boolean j(String str) {
        if (this.f31222b.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean k(String str) {
        if (this.f31221a.get(str) != null) {
            return true;
        }
        return false;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f31222b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @P i iVar) {
        this.f31221a.put(str, iVar);
    }

    @N
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f31221a + "}\n";
    }
}
