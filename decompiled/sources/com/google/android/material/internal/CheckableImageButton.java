package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: K, reason: collision with root package name */
    private static final int[] f32502K = {R.attr.state_checked};

    /* renamed from: H, reason: collision with root package name */
    private boolean f32503H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f32504I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f32505J;

    /* loaded from: classes2.dex */
    class a extends C0771a {
        a() {
        }

        @Override // androidx.core.view.C0771a
        public void f(View view, @N AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.X0(CheckableImageButton.this.a());
            m4.Y0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends androidx.customview.view.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        boolean f32507G;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@N Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@N Parcel parcel) {
            boolean z3 = true;
            if (parcel.readInt() != 1) {
                z3 = false;
            }
            this.f32507G = z3;
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f32507G ? 1 : 0);
        }

        public b(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.f32504I;
    }

    public boolean b() {
        return this.f32505J;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f32503H;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i4) {
        if (this.f32503H) {
            int[] iArr = f32502K;
            return View.mergeDrawableStates(super.onCreateDrawableState(i4 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f32507G);
    }

    @Override // android.view.View
    @N
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f32507G = this.f32503H;
        return bVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f32504I != z3) {
            this.f32504I = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (this.f32504I && this.f32503H != z3) {
            this.f32503H = z3;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z3) {
        this.f32505J = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f32505J) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f32503H);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49133K1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f32504I = true;
        this.f32505J = true;
        C0823k0.B1(this, new a());
    }
}
