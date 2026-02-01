package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.N;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class n extends l<InputStream> {

    /* renamed from: I, reason: collision with root package name */
    private static final int f25842I = 1;

    /* renamed from: J, reason: collision with root package name */
    private static final int f25843J = 2;

    /* renamed from: K, reason: collision with root package name */
    private static final int f25844K = 3;

    /* renamed from: L, reason: collision with root package name */
    private static final int f25845L = 4;

    /* renamed from: M, reason: collision with root package name */
    private static final int f25846M = 5;

    /* renamed from: N, reason: collision with root package name */
    private static final UriMatcher f25847N;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f25847N = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f25847N.match(uri);
        if (match != 1) {
            if (match != 3) {
                if (match != 5) {
                    return contentResolver.openInputStream(uri);
                }
            } else {
                return j(contentResolver, uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    private InputStream j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i4 = i(uri, contentResolver);
        if (i4 != null) {
            return i4;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
