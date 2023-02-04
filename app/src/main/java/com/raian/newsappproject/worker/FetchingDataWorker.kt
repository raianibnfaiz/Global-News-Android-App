package com.raian.newsappproject.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.raian.newsappproject.fragment.autoReload

class FetchingDataWorker(appContext: Context, workerParams: WorkerParameters) :
    CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        Log.d("worker", "stars ")
        return try {
            autoReload()

            Log.d("worker", "article called: ")
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }


    }
}