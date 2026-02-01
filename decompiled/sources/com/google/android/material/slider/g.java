package com.google.android.material.slider;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;

/* loaded from: classes2.dex */
public class g extends c<g, a, b> {

    /* loaded from: classes2.dex */
    public interface a extends com.google.android.material.slider.a<g> {
        void c(@N g gVar, float f4, boolean z3);
    }

    /* loaded from: classes2.dex */
    public interface b extends com.google.android.material.slider.b<g> {
        void b(@N g gVar);

        void d(@N g gVar);
    }

    public g(@N Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ boolean M() {
        return super.M();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ boolean S() {
        return super.S();
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@N MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@N KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.c
    protected boolean f0() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // com.google.android.material.slider.c, android.view.View
    @N
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.google.android.material.slider.c
    @N
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.google.android.material.slider.c
    @r
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void h(@N a aVar) {
        super.h(aVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void i(@N b bVar) {
        super.i(bVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void i0(@N a aVar) {
        super.i0(aVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void j0(@N b bVar) {
        super.j0(bVar);
    }

    @Override // com.google.android.material.slider.c, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i4, @N KeyEvent keyEvent) {
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.google.android.material.slider.c, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i4, @N KeyEvent keyEvent) {
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@N MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    @Override // com.google.android.material.slider.c
    public void setCustomThumbDrawable(@InterfaceC0578v int i4) {
        super.setCustomThumbDrawable(i4);
    }

    @Override // com.google.android.material.slider.c, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i4) {
        super.setFocusedThumbIndex(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setHaloRadius(@F(from = 0) @r int i4) {
        super.setHaloRadius(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@InterfaceC0574q int i4) {
        super.setHaloRadiusResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setHaloTintList(@N ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i4) {
        super.setLabelBehavior(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setLabelFormatter(@P e eVar) {
        super.setLabelFormatter(eVar);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setStepSize(float f4) {
        super.setStepSize(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbElevation(float f4) {
        super.setThumbElevation(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@InterfaceC0574q int i4) {
        super.setThumbElevationResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbRadius(@F(from = 0) @r int i4) {
        super.setThumbRadius(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@InterfaceC0574q int i4) {
        super.setThumbRadiusResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@P ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@InterfaceC0571n int i4) {
        super.setThumbStrokeColorResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f4) {
        super.setThumbStrokeWidth(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@InterfaceC0574q int i4) {
        super.setThumbStrokeWidthResource(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setThumbTintList(@N ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@N ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@N ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickTintList(@N ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z3) {
        super.setTickVisible(z3);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@N ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackHeight(@F(from = 0) @r int i4) {
        super.setTrackHeight(i4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@N ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setTrackTintList(@N ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public void setValue(float f4) {
        setValues(Float.valueOf(f4));
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setValueFrom(float f4) {
        super.setValueFrom(f4);
    }

    @Override // com.google.android.material.slider.c
    public /* bridge */ /* synthetic */ void setValueTo(float f4) {
        super.setValueTo(f4);
    }

    public g(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.ie);
    }

    @Override // com.google.android.material.slider.c
    public void setCustomThumbDrawable(@N Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    public g(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }
}
