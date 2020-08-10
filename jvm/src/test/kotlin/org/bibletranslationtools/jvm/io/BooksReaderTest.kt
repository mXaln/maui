package org.bibletranslationtools.jvm.io

import org.junit.Test

class BooksReaderTest {

    @Test
    fun testReadBooksFile() {
        val result = BooksReader().read().test()

        result.assertComplete()
        result.assertNoErrors()
    }
}
