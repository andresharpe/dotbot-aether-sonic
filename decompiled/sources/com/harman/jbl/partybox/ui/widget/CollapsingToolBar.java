package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class CollapsingToolBar extends AppBarLayout implements View.OnClickListener {

    /* renamed from: h0, reason: collision with root package name */
    private CollapsingToolbarLayout f45723h0;

    /* renamed from: i0, reason: collision with root package name */
    private ImageView f45724i0;

    /* renamed from: j0, reason: collision with root package name */
    private Toolbar f45725j0;

    /* renamed from: k0, reason: collision with root package name */
    private ImageView f45726k0;

    /* renamed from: l0, reason: collision with root package name */
    private ImageView f45727l0;

    /* renamed from: m0, reason: collision with root package name */
    private LinearLayout f45728m0;

    /* renamed from: n0, reason: collision with root package name */
    private b f45729n0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CollapsingToolBar.this.f45724i0.invalidate();
                int lineCount = CollapsingToolBar.this.f45723h0.getLineCount();
                if (lineCount > 1) {
                    CollapsingToolBar.this.f45724i0.getLayoutParams().height = (int) ((CollapsingToolBar.this.f45725j0.getHeight() * lineCount) + ((CollapsingToolBar.this.f45725j0.getHeight() * 1.8d) / lineCount));
                    CollapsingToolBar.this.f45724i0.requestLayout();
                }
            } catch (Exception e4) {
                T1.a.a("CollapsingToolbar height updating is failed " + e4.getMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();
    }

    public CollapsingToolBar(@N Context context) {
        this(context, null);
    }

    private void N(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(j.i.f41376C1, (ViewGroup) this, true);
        this.f45723h0 = (CollapsingToolbarLayout) inflate.findViewById(j.h.f41353w2);
        this.f45724i0 = (ImageView) inflate.findViewById(j.h.e7);
        this.f45725j0 = (Toolbar) inflate.findViewById(j.h.ph);
        ImageView imageView = (ImageView) inflate.findViewById(j.h.Y6);
        this.f45726k0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.widget.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsingToolBar.this.onClick(view);
            }
        });
        ImageView imageView2 = (ImageView) inflate.findViewById(j.h.E7);
        this.f45727l0 = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.widget.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsingToolBar.this.onClick(view);
            }
        });
        this.f45728m0 = (LinearLayout) inflate.findViewById(j.h.g9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41957a);
        String string = obtainStyledAttributes.getString(j.o.f41975g);
        if (!TextUtils.isEmpty(string)) {
            this.f45723h0.setTitle(string);
            this.f45723h0.post(new a());
        }
        int resourceId = obtainStyledAttributes.getResourceId(j.o.f41963c, j.n.f41851D);
        if (resourceId != 0) {
            this.f45723h0.setCollapsedTitleTextAppearance(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(j.o.f41969e, j.n.f41855H);
        if (resourceId2 != 0) {
            this.f45723h0.setExpandedTitleTextAppearance(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(j.o.f41960b, j.f.f41051i1);
        if (resourceId3 != 0) {
            this.f45726k0.setImageResource(resourceId3);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(j.o.f41972f, 0);
        if (resourceId4 != 0) {
            this.f45727l0.setImageResource(resourceId4);
            this.f45727l0.setVisibility(0);
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(j.o.f41966d, 0);
        if (resourceId5 != 0) {
            this.f45724i0.setImageResource(resourceId5);
        }
        obtainStyledAttributes.recycle();
        setBackgroundColor(context.getColor(j.d.f40732a));
        setElevation(0.0f);
    }

    public void M() {
        this.f45726k0.setVisibility(4);
    }

    public ImageView getCoverImageView() {
        return this.f45724i0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar;
        if (view.getId() == this.f45726k0.getId()) {
            b bVar2 = this.f45729n0;
            if (bVar2 != null) {
                bVar2.b();
                return;
            }
            return;
        }
        if (view.getId() == this.f45727l0.getId() && (bVar = this.f45729n0) != null) {
            bVar.a();
        }
    }

    public void setCoverImageView(Drawable drawable) {
        ImageView imageView = this.f45724i0;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setNavigationListener(b bVar) {
        this.f45729n0 = bVar;
    }

    public void setTitleText(@l3.d String str) {
        this.f45723h0.setTitle(str);
    }

    public CollapsingToolBar(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        N(context, attributeSet);
    }
}
