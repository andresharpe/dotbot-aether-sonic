package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class A<E> implements List<E>, RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private final List<E> f35266E;

    private A(List<E> list) {
        this.f35266E = Collections.unmodifiableList(list);
    }

    @N
    public static <E> A<E> b(@N List<E> list) {
        return new A<>(list);
    }

    @N
    public static <E> A<E> c(E... eArr) {
        return new A<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(@N E e4) {
        return this.f35266E.add(e4);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@N Collection<? extends E> collection) {
        return this.f35266E.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f35266E.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(@P Object obj) {
        return this.f35266E.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@N Collection<?> collection) {
        return this.f35266E.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@P Object obj) {
        return this.f35266E.equals(obj);
    }

    @Override // java.util.List
    @N
    public E get(int i4) {
        return this.f35266E.get(i4);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f35266E.hashCode();
    }

    @Override // java.util.List
    public int indexOf(@P Object obj) {
        return this.f35266E.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f35266E.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @N
    public Iterator<E> iterator() {
        return this.f35266E.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(@P Object obj) {
        return this.f35266E.lastIndexOf(obj);
    }

    @Override // java.util.List
    @N
    public ListIterator<E> listIterator() {
        return this.f35266E.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(@P Object obj) {
        return this.f35266E.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@N Collection<?> collection) {
        return this.f35266E.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@N Collection<?> collection) {
        return this.f35266E.retainAll(collection);
    }

    @Override // java.util.List
    @N
    public E set(int i4, @N E e4) {
        return this.f35266E.set(i4, e4);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f35266E.size();
    }

    @Override // java.util.List
    @N
    public List<E> subList(int i4, int i5) {
        return this.f35266E.subList(i4, i5);
    }

    @Override // java.util.List, java.util.Collection
    @P
    public Object[] toArray() {
        return this.f35266E.toArray();
    }

    @Override // java.util.List
    public void add(int i4, @N E e4) {
        this.f35266E.add(i4, e4);
    }

    @Override // java.util.List
    public boolean addAll(int i4, @N Collection<? extends E> collection) {
        return this.f35266E.addAll(i4, collection);
    }

    @Override // java.util.List
    @N
    public ListIterator<E> listIterator(int i4) {
        return this.f35266E.listIterator(i4);
    }

    @Override // java.util.List
    public E remove(int i4) {
        return this.f35266E.remove(i4);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(@P T[] tArr) {
        return (T[]) this.f35266E.toArray(tArr);
    }
}
