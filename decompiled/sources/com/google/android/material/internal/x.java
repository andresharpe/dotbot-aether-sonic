package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<View> f32732a = new a();

    /* loaded from: classes2.dex */
    class a implements Comparator<View> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private x() {
    }

    @P
    public static ActionMenuItemView a(@N Toolbar toolbar, @androidx.annotation.D int i4) {
        ActionMenuView b4 = b(toolbar);
        if (b4 != null) {
            for (int i5 = 0; i5 < b4.getChildCount(); i5++) {
                View childAt = b4.getChildAt(i5);
                if (childAt instanceof ActionMenuItemView) {
                    ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                    if (actionMenuItemView.getItemData().getItemId() == i4) {
                        return actionMenuItemView;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @P
    public static ActionMenuView b(@N Toolbar toolbar) {
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @P
    private static ImageView c(@N Toolbar toolbar, @P Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    @P
    public static ImageView d(@N Toolbar toolbar) {
        return c(toolbar, toolbar.getLogo());
    }

    @P
    public static ImageButton e(@N Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @P
    public static View f(@N Toolbar toolbar) {
        ActionMenuView b4 = b(toolbar);
        if (b4 != null && b4.getChildCount() > 1) {
            return b4.getChildAt(0);
        }
        return null;
    }

    @P
    public static TextView g(@N Toolbar toolbar) {
        List<TextView> h4 = h(toolbar, toolbar.getSubtitle());
        if (h4.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(h4, f32732a);
    }

    private static List<TextView> h(@N Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @P
    public static TextView i(@N Toolbar toolbar) {
        List<TextView> h4 = h(toolbar, toolbar.getTitle());
        if (h4.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(h4, f32732a);
    }
}
