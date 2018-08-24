package com.udacity.ralph.bookstoreapp.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Bookstore app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

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
    }

}
