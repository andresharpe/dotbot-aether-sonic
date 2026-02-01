package com.harman.jbl.partybox.ui.customviews.swipe;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c extends View {

    /* renamed from: E, reason: collision with root package name */
    private View f42864E;

    public c(Context context) {
        super(context);
    }

    public void a(View view) {
        this.f42864E = view;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        View view = this.f42864E;
        if (view != null) {
            view.draw(canvas);
            this.f42864E = null;
        }
    }
}
