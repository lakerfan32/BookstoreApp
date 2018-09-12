package com.udacity.ralph.bookstoreapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * API Contract for the Bookstore app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    /**
     * The "Content authority" is a name for the entire content provider, similar to the
     * relationship between a domain name and its website.  A convenient string to use for the
     * content authority is the package name for the app, which is guaranteed to be unique on the
     * device.
     */
    public static final String CONTENT_AUTHORITY = "com.udacity.ralph.bookstoreapp";

    /**
     * Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
     * the content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     * Possible path (appended to base content URI for possible URI's)
     * For instance, content://com.example.android.pets/pets/ is a valid path for
     * looking at pet data. content://com.example.android.pets/staff/ will fail,
     * as the ContentProvider hasn't been given any information on what to do with "staff".
     */
    public static final String PATH_BOOKS = "books";

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

        /** The content URI to access the pet data in the provider */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_BOOKS);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of books.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single book.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;

        /** Name of database table for books */
        public final static String TABLE_NAME = "books";

        /**
         * Unique ID number for the book (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Product Name of the book.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME ="Product_Name";

        /**
         * Price of the book.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_PRICE = "Price";

        /**
         * Quantities of books in stock.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_QUANTITY = "Quantity";

        /**
         * Name of Supplier of the book.
         *
         * Type: STRING
         */
        public final static String COLUMN_SUPPLIER_NAME = "Supplier_Name";

        /**
         * Phone number for Supplier of the book.
         *
         * Type: STRING
         */
        public final static String COLUMN_SUPPLIER_PHONE_NUMBER = "Supplier_Phone_Number";

        /**
         * Book Category
         *
         * The only possible values are {@link #CATEGORY_UNKNOWN}, {@link #CATEGORY_FICTION},
         * or {@link #CATEGORY_NONFICTION}.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_CATEGORY = "Category";

        /**
         * Genre of the book.
         *
         * Type: STRING
         */
        public final static String COLUMN_GENRE = "Genre";

        /**
         * Possible values for the book category.
         */
        public static final int CATEGORY_UNKNOWN = 0;
        public static final int CATEGORY_FICTION = 1;
        public static final int CATEGORY_NONFICTION = 2;

        /**
         * Returns whether or not the given gender is {@link #CATEGORY_UNKNOWN}, {@link #CATEGORY_FICTION},
         * or {@link #CATEGORY_NONFICTION}.
         */
        public static boolean isValidCategory(int category) {
            if (category == CATEGORY_UNKNOWN || category == CATEGORY_FICTION || category == CATEGORY_NONFICTION) {
                return true;
            }
            return false;
        }
    }
}
