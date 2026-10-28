package me.carlossanchez.facebook.j.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val ForgotBlue = Color(0xFF1877F2)
private val ForgotBorderGray = Color(0xFFCCD0D5)
private val ForgotTextGray = Color(0xFF606770)
private val ForgotDarkText = Color(0xFF1C1E21)

@Composable
fun FacebookForgotPasswordScreen(
    onClickBack: () -> Unit = {},
    onClickSend: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        // Logo de Facebook
        Text(
            text = "facebook",
            color = ForgotBlue,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = (-1).sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        // Título de la sección
        Text(
            text = "Encuentra tu cuenta",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = ForgotDarkText,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Instrucciones informativas
        Text(
            text = "Introduce tu correo electrónico o número de teléfono para buscar tu cuenta. Se enviará un código de recuperación si este correo está vinculado a la cuenta.",
            fontSize = 14.sp,
            color = ForgotTextGray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Campo de Email/Teléfono
        FacebookForgotPasswordTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Correo electrónico o número de teléfono",
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Done
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Botón Buscar / Enviar código
        Button(
            onClick = { onClickSend() },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = ForgotBlue),
            shape = RoundedCornerShape(6.dp)
        ) {
            Text(
                text = "Buscar",
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Botón Cancelar / Volver
        OutlinedButton(
            onClick = { onClickBack() },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = ForgotTextGray),
            border = BorderStroke(1.dp, ForgotBorderGray)
        ) {
            Text(
                text = "Cancelar",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        // Footer con marca registrada
        Text(
            text = "Meta © 2024",
            modifier = Modifier.padding(bottom = 24.dp),
            color = ForgotTextGray,
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun FacebookForgotPasswordTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    keyboardType: KeyboardType,
    imeAction: ImeAction
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text(
                text = placeholder,
                color = ForgotTextGray,
                fontSize = 16.sp
            )
        },
        singleLine = true,
        shape = RoundedCornerShape(6.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = ForgotBlue,
            unfocusedBorderColor = ForgotBorderGray,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            cursorColor = ForgotBlue
        )
    )
}
