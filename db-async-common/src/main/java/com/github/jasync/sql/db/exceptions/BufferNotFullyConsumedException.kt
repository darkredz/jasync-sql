package com.github.jasync.sql.db.exceptions

import io.netty.buffer.ByteBuf

class BufferNotFullyConsumedException(buffer: ByteBuf) :
    DatabaseException("Buffer was not fully consumed by decoder, %s bytes to read".format(buffer.readableBytes()))
