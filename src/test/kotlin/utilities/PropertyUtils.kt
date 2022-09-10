package utilities


import java.lang.Exception
import java.io.IOException
import java.io.InputStream
import java.lang.RuntimeException
import java.util.*

/**
 * This class is used to get the configuration properties from the .properties file
 */
class PropertyUtils private constructor() {
    private val props = Properties()

    init {
        loadProperties("configuration.properties")
        props.putAll(System.getProperties())
    }

    /**
     * This method will load properties file in Properties object
     *
     * @param path
     */
    fun loadProperties(path: String) {
        var inputStream: InputStream? = null
        try {
            inputStream = ClassLoader.getSystemResourceAsStream(path)
            println(inputStream)
            if (inputStream != null) {
                props.load(inputStream)
            } else {

            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            try {
                inputStream!!.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return
    }

    companion object {
        private var INSTANCE: PropertyUtils? = null
        private val instance: PropertyUtils?
            private get() {
                if (INSTANCE == null) {
                    INSTANCE = PropertyUtils()
                }
                return INSTANCE
            }

        /**
         * This method can read Property value for any given key
         *
         * @param key
         * @return
         */
        fun getProperty(key: String?): String {
            return instance!!.props.getProperty(key)
        }

        /**
         * This method will read any integer property value
         *
         * @param key
         * @param defaultValue
         * @return
         */
        @JvmStatic
        fun getIntegerProperty(key: String?, defaultValue: Int): Int {
            var integerValue = 0
            val value = instance!!.props.getProperty(key) ?: return defaultValue
            integerValue = value.toInt()
            return integerValue
        }

        /**
         * If key couldn't be found then it will return default value
         *
         * @param key
         * @param defaultValue
         * @return
         */
        @JvmStatic
        fun getProperty(key: String?, defaultValue: String?): String {
            return instance!!.props.getProperty(key, defaultValue)
        }
    }
}

