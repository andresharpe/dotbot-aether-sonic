package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1770k<TResult> {
    @androidx.annotation.N
    public AbstractC1770k<TResult> a(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @androidx.annotation.N
    public AbstractC1770k<TResult> b(@androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @androidx.annotation.N
    public AbstractC1770k<TResult> c(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @androidx.annotation.N
    public AbstractC1770k<TResult> d(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1764e<TResult> interfaceC1764e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.N
    public AbstractC1770k<TResult> e(@androidx.annotation.N InterfaceC1764e<TResult> interfaceC1764e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.N
    public AbstractC1770k<TResult> f(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1764e<TResult> interfaceC1764e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.N
    public abstract AbstractC1770k<TResult> g(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1765f interfaceC1765f);

    @androidx.annotation.N
    public abstract AbstractC1770k<TResult> h(@androidx.annotation.N InterfaceC1765f interfaceC1765f);

    @androidx.annotation.N
    public abstract AbstractC1770k<TResult> i(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1765f interfaceC1765f);

    @androidx.annotation.N
    public abstract AbstractC1770k<TResult> j(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1766g<? super TResult> interfaceC1766g);

    @androidx.annotation.N
    public abstract AbstractC1770k<TResult> k(@androidx.annotation.N InterfaceC1766g<? super TResult> interfaceC1766g);

    @androidx.annotation.N
    public abstract AbstractC1770k<TResult> l(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1766g<? super TResult> interfaceC1766g);

    @androidx.annotation.N
    public <TContinuationResult> AbstractC1770k<TContinuationResult> m(@androidx.annotation.N InterfaceC1762c<TResult, TContinuationResult> interfaceC1762c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @androidx.annotation.N
    public <TContinuationResult> AbstractC1770k<TContinuationResult> n(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1762c<TResult, TContinuationResult> interfaceC1762c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @androidx.annotation.N
    public <TContinuationResult> AbstractC1770k<TContinuationResult> o(@androidx.annotation.N InterfaceC1762c<TResult, AbstractC1770k<TContinuationResult>> interfaceC1762c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.N
    public <TContinuationResult> AbstractC1770k<TContinuationResult> p(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1762c<TResult, AbstractC1770k<TContinuationResult>> interfaceC1762c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.P
    public abstract Exception q();

    public abstract TResult r();

    public abstract <X extends Throwable> TResult s(@androidx.annotation.N Class<X> cls) throws Throwable;

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    @androidx.annotation.N
    public <TContinuationResult> AbstractC1770k<TContinuationResult> w(@androidx.annotation.N InterfaceC1769j<TResult, TContinuationResult> interfaceC1769j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @androidx.annotation.N
    public <TContinuationResult> AbstractC1770k<TContinuationResult> x(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1769j<TResult, TContinuationResult> interfaceC1769j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
