const mongoose = require('mongoose')


const userSchema = mongoose.Schema({

    username: {
        type: String,
        required: true,
        unique: true
    },
    password: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
        trim: true,
        validate(value) {
          if (!value.match(/^[^@ ]+@[^@ ]+\.[^@ .]{2,}$/)) {
            throw new Error('Email is not valid.');
          }
        },
        unique: true
    },
})

module.exports = mongoose.model('user', userSchema)