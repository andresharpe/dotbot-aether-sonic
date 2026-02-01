package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedHashTreeMap<K, V>.KeySet keySet;
    int modCount;
    int size;
    Node<K, V>[] table;
    int threshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private Node<K, V> stack;

        AvlBuilder() {
        }

        void add(Node<K, V> node) {
            node.right = null;
            node.parent = null;
            node.left = null;
            node.height = 1;
            int i4 = this.leavesToSkip;
            if (i4 > 0) {
                int i5 = this.size;
                if ((i5 & 1) == 0) {
                    this.size = i5 + 1;
                    this.leavesToSkip = i4 - 1;
                    this.leavesSkipped++;
                }
            }
            node.parent = this.stack;
            this.stack = node;
            int i6 = this.size;
            int i7 = i6 + 1;
            this.size = i7;
            int i8 = this.leavesToSkip;
            if (i8 > 0 && (i7 & 1) == 0) {
                this.size = i6 + 2;
                this.leavesToSkip = i8 - 1;
                this.leavesSkipped++;
            }
            int i9 = 4;
            while (true) {
                int i10 = i9 - 1;
                if ((this.size & i10) == i10) {
                    int i11 = this.leavesSkipped;
                    if (i11 == 0) {
                        Node<K, V> node2 = this.stack;
                        Node<K, V> node3 = node2.parent;
                        Node<K, V> node4 = node3.parent;
                        node3.parent = node4.parent;
                        this.stack = node3;
                        node3.left = node4;
                        node3.right = node2;
                        node3.height = node2.height + 1;
                        node4.parent = node3;
                        node2.parent = node3;
                    } else if (i11 == 1) {
                        Node<K, V> node5 = this.stack;
                        Node<K, V> node6 = node5.parent;
                        this.stack = node6;
                        node6.right = node5;
                        node6.height = node5.height + 1;
                        node5.parent = node6;
                        this.leavesSkipped = 0;
                    } else if (i11 == 2) {
                        this.leavesSkipped = 0;
                    }
                    i9 *= 2;
                } else {
                    return;
                }
            }
        }

        void reset(int i4) {
            this.leavesToSkip = ((Integer.highestOneBit(i4) * 2) - 1) - i4;
            this.size = 0;
            this.leavesSkipped = 0;
            this.stack = null;
        }

        Node<K, V> root() {
            Node<K, V> node = this.stack;
            if (node.parent == null) {
                return node;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AvlIterator<K, V> {
        private Node<K, V> stackTop;

        AvlIterator() {
        }

        public Node<K, V> next() {
            Node<K, V> node = this.stackTop;
            if (node == null) {
                return null;
            }
            Node<K, V> node2 = node.parent;
            node.parent = null;
            Node<K, V> node3 = node.right;
            while (true) {
                Node<K, V> node4 = node2;
                node2 = node3;
                if (node2 != null) {
                    node2.parent = node4;
                    node3 = node2.left;
                } else {
                    this.stackTop = node4;
                    return node;
                }
            }
        }

        void reset(Node<K, V> node) {
            Node<K, V> node2 = null;
            while (node != null) {
                node.parent = node2;
                node2 = node;
                node = node.left;
            }
            this.stackTop = node2;
        }
    }

    /* loaded from: classes2.dex */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedHashTreeMap.EntrySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return nextNode();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* loaded from: classes2.dex */
    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.google.gson.internal.LinkedHashTreeMap.KeySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return nextNode().key;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        Node<K, V> lastReturned = null;
        Node<K, V> next;

        LinkedTreeMapIterator() {
            this.next = LinkedHashTreeMap.this.header.next;
            this.expectedModCount = LinkedHashTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.next != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        final Node<K, V> nextNode() {
            Node<K, V> node = this.next;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node != linkedHashTreeMap.header) {
                if (linkedHashTreeMap.modCount == this.expectedModCount) {
                    this.next = node.next;
                    this.lastReturned = node;
                    return node;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.lastReturned;
            if (node != null) {
                LinkedHashTreeMap.this.removeInternal(node, true);
                this.lastReturned = null;
                this.expectedModCount = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    private void doubleCapacity() {
        Node<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(Node<K, V> node, boolean z3) {
        int i4;
        int i5;
        int i6;
        int i7;
        while (node != null) {
            Node<K, V> node2 = node.left;
            Node<K, V> node3 = node.right;
            int i8 = 0;
            if (node2 != null) {
                i4 = node2.height;
            } else {
                i4 = 0;
            }
            if (node3 != null) {
                i5 = node3.height;
            } else {
                i5 = 0;
            }
            int i9 = i4 - i5;
            if (i9 == -2) {
                Node<K, V> node4 = node3.left;
                Node<K, V> node5 = node3.right;
                if (node5 != null) {
                    i7 = node5.height;
                } else {
                    i7 = 0;
                }
                if (node4 != null) {
                    i8 = node4.height;
                }
                int i10 = i8 - i7;
                if (i10 != -1 && (i10 != 0 || z3)) {
                    rotateRight(node3);
                    rotateLeft(node);
                } else {
                    rotateLeft(node);
                }
                if (z3) {
                    return;
                }
            } else if (i9 == 2) {
                Node<K, V> node6 = node2.left;
                Node<K, V> node7 = node2.right;
                if (node7 != null) {
                    i6 = node7.height;
                } else {
                    i6 = 0;
                }
                if (node6 != null) {
                    i8 = node6.height;
                }
                int i11 = i8 - i6;
                if (i11 != 1 && (i11 != 0 || z3)) {
                    rotateLeft(node2);
                    rotateRight(node);
                } else {
                    rotateRight(node);
                }
                if (z3) {
                    return;
                }
            } else if (i9 == 0) {
                node.height = i4 + 1;
                if (z3) {
                    return;
                }
            } else {
                node.height = Math.max(i4, i5) + 1;
                if (!z3) {
                    return;
                }
            }
            node = node.parent;
        }
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.parent;
        node.parent = null;
        if (node2 != null) {
            node2.parent = node3;
        }
        if (node3 != null) {
            if (node3.left == node) {
                node3.left = node2;
                return;
            } else {
                node3.right = node2;
                return;
            }
        }
        int i4 = node.hash;
        this.table[i4 & (r0.length - 1)] = node2;
    }

    private void rotateLeft(Node<K, V> node) {
        int i4;
        int i5;
        Node<K, V> node2 = node.left;
        Node<K, V> node3 = node.right;
        Node<K, V> node4 = node3.left;
        Node<K, V> node5 = node3.right;
        node.right = node4;
        if (node4 != null) {
            node4.parent = node;
        }
        replaceInParent(node, node3);
        node3.left = node;
        node.parent = node3;
        int i6 = 0;
        if (node2 != null) {
            i4 = node2.height;
        } else {
            i4 = 0;
        }
        if (node4 != null) {
            i5 = node4.height;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        node.height = max;
        if (node5 != null) {
            i6 = node5.height;
        }
        node3.height = Math.max(max, i6) + 1;
    }

    private void rotateRight(Node<K, V> node) {
        int i4;
        int i5;
        Node<K, V> node2 = node.left;
        Node<K, V> node3 = node.right;
        Node<K, V> node4 = node2.left;
        Node<K, V> node5 = node2.right;
        node.left = node5;
        if (node5 != null) {
            node5.parent = node;
        }
        replaceInParent(node, node2);
        node2.right = node;
        node.parent = node2;
        int i6 = 0;
        if (node3 != null) {
            i4 = node3.height;
        } else {
            i4 = 0;
        }
        if (node5 != null) {
            i5 = node5.height;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        node.height = max;
        if (node4 != null) {
            i6 = node4.height;
        }
        node2.height = Math.max(max, i6) + 1;
    }

    private static int secondaryHash(int i4) {
        int i5 = i4 ^ ((i4 >>> 20) ^ (i4 >>> 12));
        return (i5 >>> 4) ^ ((i5 >>> 7) ^ i5);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        Node<K, V> node = this.header;
        Node<K, V> node2 = node.next;
        while (node2 != node) {
            Node<K, V> node3 = node2.next;
            node2.prev = null;
            node2.next = null;
            node2 = node3;
        }
        node.prev = node;
        node.next = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.EntrySet entrySet = this.entrySet;
        if (entrySet == null) {
            LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
            this.entrySet = entrySet2;
            return entrySet2;
        }
        return entrySet;
    }

    Node<K, V> find(K k4, boolean z3) {
        int i4;
        Node<K, V> node;
        Comparable comparable;
        Node<K, V> node2;
        Comparator<? super K> comparator = this.comparator;
        Node<K, V>[] nodeArr = this.table;
        int secondaryHash = secondaryHash(k4.hashCode());
        int length = (nodeArr.length - 1) & secondaryHash;
        Node<K, V> node3 = nodeArr[length];
        if (node3 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k4;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i4 = comparable.compareTo(node3.key);
                } else {
                    i4 = comparator.compare(k4, node3.key);
                }
                if (i4 == 0) {
                    return node3;
                }
                if (i4 < 0) {
                    node2 = node3.left;
                } else {
                    node2 = node3.right;
                }
                if (node2 == null) {
                    break;
                }
                node3 = node2;
            }
        } else {
            i4 = 0;
        }
        Node<K, V> node4 = node3;
        int i5 = i4;
        if (!z3) {
            return null;
        }
        Node<K, V> node5 = this.header;
        if (node4 == null) {
            if (comparator == NATURAL_ORDER && !(k4 instanceof Comparable)) {
                throw new ClassCastException(k4.getClass().getName() + " is not Comparable");
            }
            node = new Node<>(node4, k4, secondaryHash, node5, node5.prev);
            nodeArr[length] = node;
        } else {
            node = new Node<>(node4, k4, secondaryHash, node5, node5.prev);
            if (i5 < 0) {
                node4.left = node;
            } else {
                node4.right = node;
            }
            rebalance(node4, true);
        }
        int i6 = this.size;
        this.size = i6 + 1;
        if (i6 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return node;
    }

    Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
        Node<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.value, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Node<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.value;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.KeySet keySet = this.keySet;
        if (keySet == null) {
            LinkedHashTreeMap<K, V>.KeySet keySet2 = new KeySet();
            this.keySet = keySet2;
            return keySet2;
        }
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k4, V v3) {
        if (k4 != null) {
            Node<K, V> find = find(k4, true);
            V v4 = find.value;
            find.value = v3;
            return v4;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.value;
        }
        return null;
    }

    void removeInternal(Node<K, V> node, boolean z3) {
        Node<K, V> first;
        int i4;
        if (z3) {
            Node<K, V> node2 = node.prev;
            node2.next = node.next;
            node.next.prev = node2;
            node.prev = null;
            node.next = null;
        }
        Node<K, V> node3 = node.left;
        Node<K, V> node4 = node.right;
        Node<K, V> node5 = node.parent;
        int i5 = 0;
        if (node3 != null && node4 != null) {
            if (node3.height > node4.height) {
                first = node3.last();
            } else {
                first = node4.first();
            }
            removeInternal(first, false);
            Node<K, V> node6 = node.left;
            if (node6 != null) {
                i4 = node6.height;
                first.left = node6;
                node6.parent = first;
                node.left = null;
            } else {
                i4 = 0;
            }
            Node<K, V> node7 = node.right;
            if (node7 != null) {
                i5 = node7.height;
                first.right = node7;
                node7.parent = first;
                node.right = null;
            }
            first.height = Math.max(i4, i5) + 1;
            replaceInParent(node, first);
            return;
        }
        if (node3 != null) {
            replaceInParent(node, node3);
            node.left = null;
        } else if (node4 != null) {
            replaceInParent(node, node4);
            node.right = null;
        } else {
            replaceInParent(node, null);
        }
        rebalance(node5, false);
        this.size--;
        this.modCount++;
    }

    Node<K, V> removeInternalByKey(Object obj) {
        Node<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new Node<>();
        Node<K, V>[] nodeArr = new Node[16];
        this.table = nodeArr;
        this.threshold = (nodeArr.length / 2) + (nodeArr.length / 4);
    }

    static <K, V> Node<K, V>[] doubleCapacity(Node<K, V>[] nodeArr) {
        int length = nodeArr.length;
        Node<K, V>[] nodeArr2 = new Node[length * 2];
        AvlIterator avlIterator = new AvlIterator();
        AvlBuilder avlBuilder = new AvlBuilder();
        AvlBuilder avlBuilder2 = new AvlBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            Node<K, V> node = nodeArr[i4];
            if (node != null) {
                avlIterator.reset(node);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    Node<K, V> next = avlIterator.next();
                    if (next == null) {
                        break;
                    }
                    if ((next.hash & length) == 0) {
                        i5++;
                    } else {
                        i6++;
                    }
                }
                avlBuilder.reset(i5);
                avlBuilder2.reset(i6);
                avlIterator.reset(node);
                while (true) {
                    Node<K, V> next2 = avlIterator.next();
                    if (next2 == null) {
                        break;
                    }
                    if ((next2.hash & length) == 0) {
                        avlBuilder.add(next2);
                    } else {
                        avlBuilder2.add(next2);
                    }
                }
                nodeArr2[i4] = i5 > 0 ? avlBuilder.root() : null;
                nodeArr2[i4 + length] = i6 > 0 ? avlBuilder2.root() : null;
            }
        }
        return nodeArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;

        Node() {
            this.key = null;
            this.hash = -1;
            this.prev = this;
            this.next = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k4 = this.key;
            if (k4 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k4.equals(entry.getKey())) {
                return false;
            }
            V v3 = this.value;
            if (v3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.left; node2 != null; node2 = node2.left) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k4 = this.key;
            int i4 = 0;
            if (k4 == null) {
                hashCode = 0;
            } else {
                hashCode = k4.hashCode();
            }
            V v3 = this.value;
            if (v3 != null) {
                i4 = v3.hashCode();
            }
            return hashCode ^ i4;
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.right; node2 != null; node2 = node2.right) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            V v4 = this.value;
            this.value = v3;
            return v4;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        Node(Node<K, V> node, K k4, int i4, Node<K, V> node2, Node<K, V> node3) {
            this.parent = node;
            this.key = k4;
            this.hash = i4;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }
    }
}
