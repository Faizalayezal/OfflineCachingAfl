package com.tsbempire.offlinecachingAfl.framework.di

import com.tsbempire.core.repository.CommentRepository
import com.tsbempire.core.usecase.*
import com.tsbempire.offlinecachingAfl.framework.UseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: CommentRepository) = UseCases(
        AddComment(repository),
        GetAllComments(repository),
        GetComment(repository),
        UpdateComment(repository),
        RemoveComment(repository)
    )
}