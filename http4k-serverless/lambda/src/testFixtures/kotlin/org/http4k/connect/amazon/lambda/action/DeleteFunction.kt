package org.http4k.connect.amazon.lambda.action

import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Uri
import org.http4k.connect.amazon.kClass
import org.http4k.connect.amazon.lambda.model.Function
import org.http4k.connect.amazon.lambda.LambdaAction

class DeleteFunction(private val function: Function) : LambdaAction<Unit>(kClass()) {
    override fun toRequest(): Request = Request(Method.DELETE, Uri.of("/2015-03-31/functions/${function.value}"))
}
