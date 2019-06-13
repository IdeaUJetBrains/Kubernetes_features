package test

import javax.persistence.*

@Entity
@Table(name = "AUTHTOR", schema = "PUBLIC", catalog = "PUBLIC")
open class AUTHTOREntity {
    @get:Id
    @get:Column(name = "ID", nullable = false, insertable = false, updatable = false)
    var ID: Int? = null
    @get:Basic
    @get:Column(name = "FIRSTNAME", nullable = true)
    var FIRSTNAME: String? = null
    @get:Basic
    @get:Column(name = "LASTNAME", nullable = true)
    var LASTNAME: String? = null
    @get:Basic
    @get:Column(name = "VERSION", nullable = true)
    var VERSION: Int? = null

    @get:OneToOne(fetch = FetchType.LAZY)
    @get:JoinColumn(name = "ID", referencedColumnName = "ID")
    var refAUTHTORDETAILSEntity: AUTHTORDETAILSEntity? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "ID = $ID " +
                "FIRSTNAME = $FIRSTNAME " +
                "LASTNAME = $LASTNAME " +
                "VERSION = $VERSION " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as AUTHTOREntity

        if (ID != other.ID) return false
        if (FIRSTNAME != other.FIRSTNAME) return false
        if (LASTNAME != other.LASTNAME) return false
        if (VERSION != other.VERSION) return false

        return true
    }

}

