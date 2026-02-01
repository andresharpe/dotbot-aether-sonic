package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import com.google.android.material.internal.E;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: E, reason: collision with root package name */
    private final Calendar f32107E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f32108F;

    /* loaded from: classes2.dex */
    class a extends C0771a {
        a() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.b1(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i4, Rect rect) {
        if (i4 == 33) {
            setSelection(getAdapter().i());
        } else if (i4 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    private View c(int i4) {
        return getChildAt(i4 - getFirstVisiblePosition());
    }

    private static int d(@N View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(@P Long l4, @P Long l5, @P Long l6, @P Long l7) {
        if (l4 == null || l5 == null || l6 == null || l7 == null || l6.longValue() > l5.longValue() || l7.longValue() < l4.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public n getAdapter2() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@N Canvas canvas) {
        int a4;
        int d4;
        int a5;
        int d5;
        int i4;
        int i5;
        int i6;
        int i7;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        n adapter = getAdapter();
        f<?> fVar = adapter.f32235F;
        c cVar = adapter.f32237H;
        int max = Math.max(adapter.b(), getFirstVisiblePosition());
        int min = Math.min(adapter.i(), getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<androidx.core.util.q<Long, Long>> it = fVar.j().iterator();
        while (it.hasNext()) {
            androidx.core.util.q<Long, Long> next = it.next();
            Long l4 = next.f13025a;
            if (l4 != null) {
                if (next.f13026b != null) {
                    long longValue = l4.longValue();
                    long longValue2 = next.f13026b.longValue();
                    if (!e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean k4 = E.k(this);
                        if (longValue < item.longValue()) {
                            if (adapter.f(max)) {
                                left2 = 0;
                            } else if (!k4) {
                                left2 = materialCalendarGridView.c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.c(max - 1).getLeft();
                            }
                            d4 = left2;
                            a4 = max;
                        } else {
                            materialCalendarGridView.f32107E.setTimeInMillis(longValue);
                            a4 = adapter.a(materialCalendarGridView.f32107E.get(5));
                            d4 = d(materialCalendarGridView.c(a4));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter.g(min)) {
                                left = getWidth();
                            } else if (!k4) {
                                left = materialCalendarGridView.c(min).getRight();
                            } else {
                                left = materialCalendarGridView.c(min).getLeft();
                            }
                            d5 = left;
                            a5 = min;
                        } else {
                            materialCalendarGridView.f32107E.setTimeInMillis(longValue2);
                            a5 = adapter.a(materialCalendarGridView.f32107E.get(5));
                            d5 = d(materialCalendarGridView.c(a5));
                        }
                        int itemId = (int) adapter.getItemId(a4);
                        int i8 = max;
                        int i9 = min;
                        int itemId2 = (int) adapter.getItemId(a5);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View c4 = materialCalendarGridView.c(numColumns);
                            int top = c4.getTop() + cVar.f32190a.e();
                            n nVar = adapter;
                            int bottom = c4.getBottom() - cVar.f32190a.b();
                            if (!k4) {
                                if (numColumns > a4) {
                                    i7 = 0;
                                } else {
                                    i7 = d4;
                                }
                                if (a5 > numColumns2) {
                                    i6 = getWidth();
                                } else {
                                    i6 = d5;
                                }
                            } else {
                                if (a5 > numColumns2) {
                                    i4 = 0;
                                } else {
                                    i4 = d5;
                                }
                                if (numColumns > a4) {
                                    i5 = getWidth();
                                } else {
                                    i5 = d4;
                                }
                                int i10 = i4;
                                i6 = i5;
                                i7 = i10;
                            }
                            canvas.drawRect(i7, top, i6, bottom, cVar.f32197h);
                            itemId++;
                            materialCalendarGridView = this;
                            it = it;
                            adapter = nVar;
                        }
                        materialCalendarGridView = this;
                        max = i8;
                        min = i9;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z3, int i4, Rect rect) {
        if (z3) {
            a(i4, rect);
        } else {
            super.onFocusChanged(false, i4, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f32108F) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(C0823k0.f13588s, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i4) {
        if (i4 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i4);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f32107E = v.v();
        if (MaterialDatePicker.E0(getContext())) {
            setNextFocusLeftId(a.h.f2632B0);
            setNextFocusRightId(a.h.f2700S0);
        }
        this.f32108F = MaterialDatePicker.F0(getContext());
        C0823k0.B1(this, new a());
    }
}
